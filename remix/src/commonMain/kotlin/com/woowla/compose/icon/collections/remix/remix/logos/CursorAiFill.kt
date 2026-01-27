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

public val LogosGroup.CursorAiFill: ImageVector
    get() {
        if (_cursorAiFill != null) {
            return _cursorAiFill!!
        }
        _cursorAiFill = Builder(name = "CursorAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.121f, 6.33f)
                lineTo(12.45f, 1.353f)
                curveTo(12.172f, 1.193f, 11.828f, 1.193f, 11.55f, 1.353f)
                lineTo(2.879f, 6.33f)
                curveTo(2.644f, 6.464f, 2.5f, 6.713f, 2.5f, 6.982f)
                verticalLineTo(17.018f)
                curveTo(2.5f, 17.287f, 2.644f, 17.536f, 2.879f, 17.67f)
                lineTo(11.55f, 22.647f)
                curveTo(11.828f, 22.807f, 12.172f, 22.807f, 12.45f, 22.647f)
                lineTo(21.122f, 17.67f)
                curveTo(21.356f, 17.536f, 21.5f, 17.287f, 21.5f, 17.018f)
                verticalLineTo(6.982f)
                curveTo(21.5f, 6.713f, 21.355f, 6.464f, 21.121f, 6.33f)
                close()
                moveTo(20.577f, 7.384f)
                lineTo(12.206f, 21.798f)
                curveTo(12.149f, 21.895f, 12.0f, 21.855f, 12.0f, 21.743f)
                verticalLineTo(12.305f)
                curveTo(12.0f, 12.116f, 11.898f, 11.942f, 11.734f, 11.847f)
                lineTo(3.512f, 7.128f)
                curveTo(3.415f, 7.072f, 3.455f, 6.924f, 3.568f, 6.924f)
                horizontalLineTo(20.31f)
                curveTo(20.547f, 6.924f, 20.696f, 7.18f, 20.577f, 7.384f)
                close()
            }
        }
        .build()
        return _cursorAiFill!!
    }

private var _cursorAiFill: ImageVector? = null
