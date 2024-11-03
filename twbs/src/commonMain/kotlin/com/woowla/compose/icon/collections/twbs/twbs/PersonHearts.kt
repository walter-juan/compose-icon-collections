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

public val Twbs.PersonHearts: ImageVector
    get() {
        if (_personHearts != null) {
            return _personHearts!!
        }
        _personHearts = Builder(name = "PersonHearts", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 1.246f)
                curveToRelative(0.832f, -0.855f, 2.913f, 0.642f, 0.0f, 2.566f)
                curveToRelative(-2.913f, -1.924f, -0.832f, -3.421f, 0.0f, -2.566f)
                moveTo(9.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                moveToRelative(-9.0f, 8.0f)
                curveToRelative(0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                reflectiveCurveToRelative(1.0f, 0.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, -4.0f, -6.0f, -4.0f)
                reflectiveCurveToRelative(-6.0f, 3.0f, -6.0f, 4.0f)
                moveToRelative(13.5f, -8.09f)
                curveToRelative(1.387f, -1.425f, 4.855f, 1.07f, 0.0f, 4.277f)
                curveToRelative(-4.854f, -3.207f, -1.387f, -5.702f, 0.0f, -4.276f)
                close()
                moveTo(15.0f, 2.165f)
                curveToRelative(0.555f, -0.57f, 1.942f, 0.428f, 0.0f, 1.711f)
                curveToRelative(-1.942f, -1.283f, -0.555f, -2.281f, 0.0f, -1.71f)
                close()
            }
        }
        .build()
        return _personHearts!!
    }

private var _personHearts: ImageVector? = null
