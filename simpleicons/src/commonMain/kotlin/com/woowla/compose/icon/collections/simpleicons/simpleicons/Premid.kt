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

public val Simpleicons.Premid: ImageVector
    get() {
        if (_premid != null) {
            return _premid!!
        }
        _premid = Builder(name = "Premid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.46f, 4.075f)
                curveToRelative(0.85f, 0.0f, 1.54f, 0.69f, 1.54f, 1.54f)
                verticalLineToRelative(12.77f)
                curveToRelative(0.0f, 0.85f, -0.69f, 1.54f, -1.54f, 1.54f)
                horizontalLineTo(1.54f)
                curveToRelative(-0.85f, 0.0f, -1.54f, -0.69f, -1.54f, -1.54f)
                verticalLineTo(5.615f)
                curveToRelative(0.0f, -0.85f, 0.69f, -1.54f, 1.54f, -1.54f)
                close()
                moveTo(3.442f, 8.485f)
                curveToRelative(-0.4f, 0.0f, -0.725f, 0.323f, -0.725f, 0.724f)
                verticalLineToRelative(5.673f)
                arcToRelative(0.725f, 0.725f, 0.0f, false, false, 1.08f, 0.631f)
                lineToRelative(5.043f, -2.836f)
                arcToRelative(0.725f, 0.725f, 0.0f, false, false, 0.0f, -1.263f)
                lineTo(3.797f, 8.577f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.355f, -0.093f)
                moveToRelative(17.162f, 5.372f)
                horizontalLineToRelative(-7.698f)
                arcToRelative(0.68f, 0.68f, 0.0f, true, false, 0.0f, 1.358f)
                horizontalLineToRelative(7.698f)
                arcToRelative(0.68f, 0.68f, 0.0f, true, false, 0.0f, -1.358f)
                moveToRelative(0.0f, -2.446f)
                horizontalLineToRelative(-7.698f)
                arcToRelative(0.68f, 0.68f, 0.0f, true, false, 0.0f, 1.359f)
                horizontalLineToRelative(7.698f)
                arcToRelative(0.68f, 0.68f, 0.0f, true, false, 0.0f, -1.359f)
                moveToRelative(-3.17f, -2.445f)
                horizontalLineToRelative(-4.528f)
                arcToRelative(0.68f, 0.68f, 0.0f, true, false, 0.0f, 1.359f)
                horizontalLineToRelative(4.528f)
                arcToRelative(0.68f, 0.68f, 0.0f, true, false, 0.0f, -1.359f)
            }
        }
        .build()
        return _premid!!
    }

private var _premid: ImageVector? = null
