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

public val Twbs.PersonFill: ImageVector
    get() {
        if (_personFill != null) {
            return _personFill!!
        }
        _personFill = Builder(name = "PersonFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                reflectiveCurveToRelative(-1.0f, 0.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, -4.0f, 6.0f, -4.0f)
                reflectiveCurveToRelative(6.0f, 3.0f, 6.0f, 4.0f)
                reflectiveCurveToRelative(-1.0f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(8.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
            }
        }
        .build()
        return _personFill!!
    }

private var _personFill: ImageVector? = null
