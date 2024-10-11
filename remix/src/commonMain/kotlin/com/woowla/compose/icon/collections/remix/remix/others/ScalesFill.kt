package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.ScalesFill: ImageVector
    get() {
        if (_scalesFill != null) {
            return _scalesFill!!
        }
        _scalesFill = Builder(name = "ScalesFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.998f, 2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.998f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.998f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.998f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.998f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.998f)
                close()
                moveTo(4.998f, 6.343f)
                lineTo(7.826f, 9.172f)
                curveTo(8.55f, 9.895f, 8.998f, 10.895f, 8.998f, 12.0f)
                curveTo(8.998f, 14.209f, 7.207f, 16.0f, 4.998f, 16.0f)
                curveTo(2.789f, 16.0f, 0.998f, 14.209f, 0.998f, 12.0f)
                curveTo(0.998f, 10.895f, 1.446f, 9.895f, 2.17f, 9.172f)
                lineTo(4.998f, 6.343f)
                close()
                moveTo(18.998f, 6.343f)
                lineTo(21.826f, 9.172f)
                curveTo(22.55f, 9.895f, 22.998f, 10.895f, 22.998f, 12.0f)
                curveTo(22.998f, 14.209f, 21.207f, 16.0f, 18.998f, 16.0f)
                curveTo(16.789f, 16.0f, 14.998f, 14.209f, 14.998f, 12.0f)
                curveTo(14.998f, 10.895f, 15.446f, 9.895f, 16.17f, 9.172f)
                lineTo(18.998f, 6.343f)
                close()
                moveTo(18.998f, 9.172f)
                lineTo(17.584f, 10.586f)
                curveTo(17.21f, 10.96f, 16.998f, 11.461f, 16.998f, 12.0f)
                lineTo(20.998f, 12.001f)
                curveTo(20.998f, 11.461f, 20.786f, 10.96f, 20.412f, 10.586f)
                lineTo(18.998f, 9.172f)
                close()
                moveTo(4.998f, 9.172f)
                lineTo(3.584f, 10.586f)
                curveTo(3.21f, 10.96f, 2.998f, 11.461f, 2.998f, 12.0f)
                lineTo(6.998f, 12.001f)
                curveTo(6.998f, 11.461f, 6.786f, 10.96f, 6.412f, 10.586f)
                lineTo(4.998f, 9.172f)
                close()
            }
        }
        .build()
        return _scalesFill!!
    }

private var _scalesFill: ImageVector? = null
