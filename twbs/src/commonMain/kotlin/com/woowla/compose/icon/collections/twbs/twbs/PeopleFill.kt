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

public val Twbs.PeopleFill: ImageVector
    get() {
        if (_peopleFill != null) {
            return _peopleFill!!
        }
        _peopleFill = Builder(name = "PeopleFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                reflectiveCurveToRelative(-1.0f, 0.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, -4.0f, 5.0f, -4.0f)
                reflectiveCurveToRelative(5.0f, 3.0f, 5.0f, 4.0f)
                reflectiveCurveToRelative(-1.0f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(11.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                moveToRelative(-5.784f, 6.0f)
                arcTo(2.24f, 2.24f, 0.0f, false, true, 5.0f, 13.0f)
                curveToRelative(0.0f, -1.355f, 0.68f, -2.75f, 1.936f, -3.72f)
                arcTo(6.3f, 6.3f, 0.0f, false, false, 5.0f, 9.0f)
                curveToRelative(-4.0f, 0.0f, -5.0f, 3.0f, -5.0f, 4.0f)
                reflectiveCurveToRelative(1.0f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(4.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
            }
        }
        .build()
        return _peopleFill!!
    }

private var _peopleFill: ImageVector? = null
