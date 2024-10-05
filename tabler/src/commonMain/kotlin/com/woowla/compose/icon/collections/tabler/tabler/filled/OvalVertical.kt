package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.OvalVertical: ImageVector
    get() {
        if (_ovalVertical != null) {
            return _ovalVertical!!
        }
        _ovalVertical = Builder(name = "OvalVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveToRelative(-5.457f, 0.0f, -10.0f, 3.028f, -10.0f, 7.0f)
                reflectiveCurveToRelative(4.543f, 7.0f, 10.0f, 7.0f)
                reflectiveCurveToRelative(10.0f, -3.028f, 10.0f, -7.0f)
                reflectiveCurveToRelative(-4.543f, -7.0f, -10.0f, -7.0f)
                close()
            }
        }
        .build()
        return _ovalVertical!!
    }

private var _ovalVertical: ImageVector? = null
