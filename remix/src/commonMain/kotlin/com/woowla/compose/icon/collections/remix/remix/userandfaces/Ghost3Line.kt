package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.Ghost3Line: ImageVector
    get() {
        if (_ghost3Line != null) {
            return _ghost3Line!!
        }
        _ghost3Line = Builder(name = "Ghost3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(16.971f, 2.0f, 21.0f, 6.029f, 21.0f, 11.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.265f, 20.895f, 19.52f, 20.707f, 19.707f)
                lineTo(18.707f, 21.707f)
                curveTo(18.37f, 22.044f, 17.842f, 22.096f, 17.445f, 21.832f)
                lineTo(15.0f, 20.201f)
                lineTo(12.555f, 21.832f)
                curveTo(12.219f, 22.056f, 11.781f, 22.056f, 11.445f, 21.832f)
                lineTo(9.0f, 20.201f)
                lineTo(6.555f, 21.832f)
                curveTo(6.158f, 22.096f, 5.63f, 22.044f, 5.293f, 21.707f)
                lineTo(3.293f, 19.707f)
                curveTo(3.105f, 19.52f, 3.0f, 19.265f, 3.0f, 19.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 6.029f, 7.029f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(8.134f, 4.0f, 5.0f, 7.134f, 5.0f, 11.0f)
                verticalLineTo(18.586f)
                lineTo(6.127f, 19.713f)
                lineTo(8.445f, 18.168f)
                lineTo(8.575f, 18.095f)
                curveTo(8.889f, 17.948f, 9.261f, 17.972f, 9.555f, 18.168f)
                lineTo(12.0f, 19.798f)
                lineTo(14.445f, 18.168f)
                lineTo(14.575f, 18.095f)
                curveTo(14.889f, 17.948f, 15.261f, 17.972f, 15.555f, 18.168f)
                lineTo(17.872f, 19.713f)
                lineTo(19.0f, 18.586f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 7.134f, 15.866f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(9.5f, 8.0f)
                curveTo(10.328f, 8.0f, 11.0f, 8.672f, 11.0f, 9.5f)
                curveTo(11.0f, 10.328f, 10.328f, 11.0f, 9.5f, 11.0f)
                curveTo(8.672f, 11.0f, 8.0f, 10.328f, 8.0f, 9.5f)
                curveTo(8.0f, 8.672f, 8.672f, 8.0f, 9.5f, 8.0f)
                close()
                moveTo(14.5f, 8.0f)
                curveTo(15.328f, 8.0f, 16.0f, 8.672f, 16.0f, 9.5f)
                curveTo(16.0f, 10.328f, 15.328f, 11.0f, 14.5f, 11.0f)
                curveTo(13.672f, 11.0f, 13.0f, 10.328f, 13.0f, 9.5f)
                curveTo(13.0f, 8.672f, 13.672f, 8.0f, 14.5f, 8.0f)
                close()
            }
        }
        .build()
        return _ghost3Line!!
    }

private var _ghost3Line: ImageVector? = null
