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

public val Twbs.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 8.5f)
                verticalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 16.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 0.0f, 13.5f)
                verticalLineToRelative(-5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.5f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                moveTo(2.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 8.5f)
                verticalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 15.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 7.0f)
                close()
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null
