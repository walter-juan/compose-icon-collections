package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.ChromeFill: ImageVector
    get() {
        if (_chromeFill != null) {
            return _chromeFill!!
        }
        _chromeFill = Builder(name = "ChromeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.827f, 21.763f)
                curveTo(5.349f, 20.771f, 2.0f, 16.777f, 2.0f, 12.0f)
                curveTo(2.0f, 10.178f, 2.487f, 8.47f, 3.339f, 6.998f)
                lineTo(7.622f, 14.417f)
                curveTo(8.474f, 15.957f, 10.115f, 17.0f, 12.0f, 17.0f)
                curveTo(12.202f, 17.0f, 12.402f, 16.988f, 12.598f, 16.965f)
                lineTo(9.827f, 21.763f)
                close()
                moveTo(12.0f, 22.0f)
                lineTo(16.287f, 14.575f)
                curveTo(16.74f, 13.823f, 17.0f, 12.942f, 17.0f, 12.0f)
                curveTo(17.0f, 10.874f, 16.628f, 9.836f, 16.0f, 9.0f)
                horizontalLineTo(21.542f)
                curveTo(21.84f, 9.947f, 22.0f, 10.955f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(14.572f, 13.545f)
                curveTo(14.047f, 14.417f, 13.092f, 15.0f, 12.0f, 15.0f)
                curveTo(10.89f, 15.0f, 9.92f, 14.397f, 9.401f, 13.5f)
                lineTo(9.373f, 13.45f)
                curveTo(9.135f, 13.02f, 9.0f, 12.526f, 9.0f, 12.0f)
                curveTo(9.0f, 10.343f, 10.343f, 9.0f, 12.0f, 9.0f)
                curveTo(13.657f, 9.0f, 15.0f, 10.343f, 15.0f, 12.0f)
                curveTo(15.0f, 12.547f, 14.854f, 13.059f, 14.599f, 13.5f)
                lineTo(14.572f, 13.545f)
                close()
                moveTo(4.632f, 5.239f)
                curveTo(6.46f, 3.248f, 9.084f, 2.0f, 12.0f, 2.0f)
                curveTo(15.701f, 2.0f, 18.933f, 4.011f, 20.662f, 7.0f)
                horizontalLineTo(12.0f)
                curveTo(9.936f, 7.0f, 8.165f, 8.25f, 7.401f, 10.035f)
                lineTo(4.632f, 5.239f)
                close()
            }
        }
        .build()
        return _chromeFill!!
    }

private var _chromeFill: ImageVector? = null
