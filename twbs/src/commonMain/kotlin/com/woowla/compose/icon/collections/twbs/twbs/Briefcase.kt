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

public val Twbs.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 2.5f)
                lineTo(5.0f, 3.0f)
                lineTo(1.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 4.5f)
                verticalLineToRelative(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 14.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 3.0f)
                lineTo(11.0f, 3.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 1.0f)
                close()
                moveTo(6.5f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(10.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveToRelative(1.886f, 6.914f)
                lineTo(15.0f, 7.151f)
                lineTo(15.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(1.0f, 7.15f)
                lineToRelative(6.614f, 1.764f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.772f, 0.0f)
                moveTo(1.5f, 4.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.616f)
                lineTo(8.129f, 7.948f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.258f, 0.0f)
                lineTo(1.0f, 6.116f)
                lineTo(1.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
