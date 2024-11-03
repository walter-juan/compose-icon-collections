package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FiletypePy: ImageVector
    get() {
        if (_filetypePy != null) {
            return _filetypePy!!
        }
        _filetypePy = Builder(name = "FiletypePy", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 4.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 3.0f)
                lineTo(9.5f, 1.0f)
                lineTo(4.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(0.0f, 11.85f)
                horizontalLineToRelative(1.6f)
                quadToRelative(0.434f, 0.0f, 0.732f, 0.179f)
                quadToRelative(0.302f, 0.175f, 0.46f, 0.477f)
                reflectiveQuadToRelative(0.158f, 0.677f)
                reflectiveQuadToRelative(-0.16f, 0.677f)
                quadToRelative(-0.158f, 0.299f, -0.464f, 0.474f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, true, -0.732f, 0.173f)
                lineTo(0.79f, 14.507f)
                verticalLineToRelative(1.342f)
                lineTo(0.0f, 15.849f)
                close()
                moveTo(2.06f, 13.564f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.085f, -0.381f)
                quadToRelative(0.0f, -0.34f, -0.185f, -0.521f)
                quadToRelative(-0.185f, -0.182f, -0.513f, -0.182f)
                lineTo(0.788f, 12.48f)
                verticalLineToRelative(1.406f)
                horizontalLineToRelative(0.66f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.374f, -0.082f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, 0.238f, -0.24f)
                moveToRelative(2.963f, 0.75f)
                verticalLineToRelative(1.535f)
                lineTo(4.23f, 15.849f)
                verticalLineToRelative(-1.52f)
                lineTo(2.89f, 11.85f)
                horizontalLineToRelative(0.876f)
                lineToRelative(0.853f, 1.696f)
                horizontalLineToRelative(0.032f)
                lineToRelative(0.856f, -1.696f)
                horizontalLineToRelative(0.855f)
                close()
            }
        }
        .build()
        return _filetypePy!!
    }

private var _filetypePy: ImageVector? = null
