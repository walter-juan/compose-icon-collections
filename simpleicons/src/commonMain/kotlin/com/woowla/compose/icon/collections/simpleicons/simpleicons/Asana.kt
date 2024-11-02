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

public val Simpleicons.Asana: ImageVector
    get() {
        if (_asana != null) {
            return _asana!!
        }
        _asana = Builder(name = "Asana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.78f, 12.653f)
                curveToRelative(-2.882f, 0.0f, -5.22f, 2.336f, -5.22f, 5.22f)
                reflectiveCurveToRelative(2.338f, 5.22f, 5.22f, 5.22f)
                reflectiveCurveToRelative(5.22f, -2.34f, 5.22f, -5.22f)
                reflectiveCurveToRelative(-2.336f, -5.22f, -5.22f, -5.22f)
                close()
                moveTo(5.22f, 12.653f)
                curveToRelative(-2.88f, 0.0f, -5.22f, 2.337f, -5.22f, 5.22f)
                reflectiveCurveToRelative(2.338f, 5.22f, 5.22f, 5.22f)
                reflectiveCurveToRelative(5.22f, -2.338f, 5.22f, -5.22f)
                reflectiveCurveToRelative(-2.336f, -5.22f, -5.22f, -5.22f)
                close()
                moveTo(17.22f, 6.128f)
                curveToRelative(0.0f, 2.883f, -2.337f, 5.22f, -5.22f, 5.22f)
                curveToRelative(-2.882f, 0.0f, -5.22f, -2.337f, -5.22f, -5.22f)
                curveToRelative(0.0f, -2.88f, 2.338f, -5.22f, 5.22f, -5.22f)
                curveToRelative(2.883f, 0.0f, 5.22f, 2.34f, 5.22f, 5.22f)
                close()
            }
        }
        .build()
        return _asana!!
    }

private var _asana: ImageVector? = null
