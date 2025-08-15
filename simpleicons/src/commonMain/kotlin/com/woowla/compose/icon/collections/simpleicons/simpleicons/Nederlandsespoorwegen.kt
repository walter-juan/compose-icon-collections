package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Nederlandsespoorwegen: ImageVector
    get() {
        if (_nederlandsespoorwegen != null) {
            return _nederlandsespoorwegen!!
        }
        _nederlandsespoorwegen = Builder(name = "Nederlandsespoorwegen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.494f, 11.812f)
                arcToRelative(2.602f, 2.602f, 0.0f, false, false, -1.835f, -0.751f)
                lineTo(3.576f, 11.061f)
                lineTo(5.46f, 9.184f)
                horizontalLineToRelative(4.753f)
                arcToRelative(0.757f, 0.757f, 0.0f, false, true, 0.516f, 0.234f)
                lineToRelative(2.777f, 2.77f)
                arcToRelative(2.602f, 2.602f, 0.0f, false, false, 1.835f, 0.75f)
                horizontalLineToRelative(5.084f)
                lineToRelative(-1.884f, 1.878f)
                horizontalLineToRelative(-4.752f)
                arcToRelative(0.757f, 0.757f, 0.0f, false, true, -0.516f, -0.235f)
                close()
                moveTo(11.953f, 15.895f)
                arcToRelative(2.863f, 2.863f, 0.0f, false, false, 1.835f, 0.798f)
                horizontalLineToRelative(5.506f)
                lineTo(24.0f, 12.0f)
                lineToRelative(-4.706f, -4.694f)
                lineTo(16.66f, 7.306f)
                lineToRelative(3.764f, 3.755f)
                horizontalLineToRelative(-5.082f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -0.516f, -0.188f)
                lineToRelative(-2.778f, -2.769f)
                arcToRelative(2.863f, 2.863f, 0.0f, false, false, -1.835f, -0.798f)
                lineTo(4.706f, 7.306f)
                lineTo(0.0f, 12.0f)
                lineToRelative(4.706f, 4.693f)
                lineTo(7.34f, 16.693f)
                lineTo(3.577f, 12.94f)
                horizontalLineToRelative(5.082f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, 0.516f, 0.187f)
                close()
            }
        }
        .build()
        return _nederlandsespoorwegen!!
    }

private var _nederlandsespoorwegen: ImageVector? = null
