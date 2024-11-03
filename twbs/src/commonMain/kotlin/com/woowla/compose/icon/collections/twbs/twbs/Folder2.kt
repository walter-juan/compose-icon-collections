package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Folder2: ImageVector
    get() {
        if (_folder2 != null) {
            return _folder2!!
        }
        _folder2 = Builder(name = "Folder2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 2.0f)
                horizontalLineToRelative(2.764f)
                curveToRelative(0.958f, 0.0f, 1.76f, 0.56f, 2.311f, 1.184f)
                curveTo(7.985f, 3.648f, 8.48f, 4.0f, 9.0f, 4.0f)
                horizontalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 5.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 12.5f)
                close()
                moveTo(2.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.964f, 0.0f, -1.71f, -0.629f, -2.174f, -1.154f)
                curveTo(6.374f, 3.334f, 5.82f, 3.0f, 5.264f, 3.0f)
                close()
                moveTo(14.0f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _folder2!!
    }

private var _folder2: ImageVector? = null
