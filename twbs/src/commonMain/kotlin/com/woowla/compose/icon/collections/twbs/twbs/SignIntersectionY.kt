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

public val Twbs.SignIntersectionY: ImageVector
    get() {
        if (_signIntersectionY != null) {
            return _signIntersectionY!!
        }
        _signIntersectionY = Builder(name = "SignIntersectionY", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.493f, 5.197f)
                lineTo(8.0f, 7.483f)
                lineTo(5.507f, 5.197f)
                lineTo(4.493f, 6.303f)
                lineTo(7.25f, 8.83f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(8.83f)
                lineToRelative(2.757f, -2.527f)
                close()
            }
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
                moveTo(7.65f, 1.135f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, true, 0.7f, 0.0f)
                lineToRelative(6.516f, 6.515f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, true, 0.0f, 0.7f)
                lineTo(8.35f, 14.866f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, true, -0.7f, 0.0f)
                lineTo(1.134f, 8.35f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, true, 0.0f, -0.7f)
                lineTo(7.65f, 1.134f)
                close()
            }
        }
        .build()
        return _signIntersectionY!!
    }

private var _signIntersectionY: ImageVector? = null
