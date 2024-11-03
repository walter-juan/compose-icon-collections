package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Repeat1: ImageVector
    get() {
        if (_repeat1 != null) {
            return _repeat1!!
        }
        _repeat1 = Builder(name = "Repeat1", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                verticalLineToRelative(1.466f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.41f, 0.192f)
                lineToRelative(2.36f, -1.966f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.384f)
                lineToRelative(-2.36f, -1.966f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.41f, 0.192f)
                lineTo(11.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.48f, 7.223f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.896f, -0.446f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.0f, 4.0f)
                close()
                moveTo(15.48f, 5.777f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.896f, 0.446f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 12.0f)
                lineTo(5.001f, 12.0f)
                verticalLineToRelative(-1.466f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.41f, -0.192f)
                lineToRelative(-2.36f, 1.966f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.384f)
                lineToRelative(2.36f, 1.966f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.41f, -0.192f)
                lineTo(5.001f, 13.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.48f, -7.223f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.854f, -0.354f)
                lineToRelative(-1.75f, 1.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, 0.708f)
                lineTo(8.0f, 6.707f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                close()
            }
        }
        .build()
        return _repeat1!!
    }

private var _repeat1: ImageVector? = null
