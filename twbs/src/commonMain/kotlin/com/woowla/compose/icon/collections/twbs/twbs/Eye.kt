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

public val Twbs.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                reflectiveCurveToRelative(-3.0f, -5.5f, -8.0f, -5.5f)
                reflectiveCurveTo(0.0f, 8.0f, 0.0f, 8.0f)
                reflectiveCurveToRelative(3.0f, 5.5f, 8.0f, 5.5f)
                reflectiveCurveTo(16.0f, 8.0f, 16.0f, 8.0f)
                moveTo(1.173f, 8.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, 1.66f, -2.043f)
                curveTo(4.12f, 4.668f, 5.88f, 3.5f, 8.0f, 3.5f)
                reflectiveCurveToRelative(3.879f, 1.168f, 5.168f, 2.457f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 14.828f, 8.0f)
                quadToRelative(-0.086f, 0.13f, -0.195f, 0.288f)
                curveToRelative(-0.335f, 0.48f, -0.83f, 1.12f, -1.465f, 1.755f)
                curveTo(11.879f, 11.332f, 10.119f, 12.5f, 8.0f, 12.5f)
                reflectiveCurveToRelative(-3.879f, -1.168f, -5.168f, -2.457f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 1.172f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(4.5f, 8.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
