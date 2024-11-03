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

public val Twbs.PauseBtnFill: ImageVector
    get() {
        if (_pauseBtnFill != null) {
            return _pauseBtnFill!!
        }
        _pauseBtnFill = Builder(name = "PauseBtnFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                moveToRelative(6.25f, -7.0f)
                curveTo(5.56f, 5.0f, 5.0f, 5.56f, 5.0f, 6.25f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 2.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                curveTo(7.5f, 5.56f, 6.94f, 5.0f, 6.25f, 5.0f)
                moveToRelative(3.5f, 0.0f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 2.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                curveTo(11.0f, 5.56f, 10.44f, 5.0f, 9.75f, 5.0f)
            }
        }
        .build()
        return _pauseBtnFill!!
    }

private var _pauseBtnFill: ImageVector? = null
