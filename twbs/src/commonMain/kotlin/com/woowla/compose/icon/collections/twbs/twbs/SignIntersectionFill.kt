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

public val Twbs.SignIntersectionFill: ImageVector
    get() {
        if (_signIntersectionFill != null) {
            return _signIntersectionFill!!
        }
        _signIntersectionFill = Builder(name = "SignIntersectionFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0.0f)
                lineTo(0.436f, 6.95f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0.0f, 2.098f)
                lineToRelative(6.516f, 6.516f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0.0f)
                lineToRelative(6.516f, -6.516f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0.0f, -2.098f)
                close()
                moveTo(7.25f, 4.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.25f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(8.75f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.25f)
                close()
            }
        }
        .build()
        return _signIntersectionFill!!
    }

private var _signIntersectionFill: ImageVector? = null
