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

public val Twbs.People: ImageVector
    get() {
        if (_people != null) {
            return _people!!
        }
        _people = Builder(name = "People", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                reflectiveCurveToRelative(1.0f, 0.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, -4.0f, -5.0f, -4.0f)
                reflectiveCurveToRelative(-5.0f, 3.0f, -5.0f, 4.0f)
                reflectiveCurveToRelative(1.0f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(7.022f, 13.0f)
                lineTo(7.0f, 12.996f)
                curveToRelative(0.001f, -0.264f, 0.167f, -1.03f, 0.76f, -1.72f)
                curveTo(8.312f, 10.629f, 9.282f, 10.0f, 11.0f, 10.0f)
                curveToRelative(1.717f, 0.0f, 2.687f, 0.63f, 3.24f, 1.276f)
                curveToRelative(0.593f, 0.69f, 0.758f, 1.457f, 0.76f, 1.72f)
                lineToRelative(-0.008f, 0.002f)
                lineToRelative(-0.014f, 0.002f)
                close()
                moveTo(11.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                moveToRelative(3.0f, -2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                moveTo(6.936f, 9.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.23f, -0.247f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.0f, 9.0f)
                curveToRelative(-4.0f, 0.0f, -5.0f, 3.0f, -5.0f, 4.0f)
                quadToRelative(0.0f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.216f)
                arcTo(2.24f, 2.24f, 0.0f, false, true, 5.0f, 13.0f)
                curveToRelative(0.0f, -1.01f, 0.377f, -2.042f, 1.09f, -2.904f)
                curveToRelative(0.243f, -0.294f, 0.526f, -0.569f, 0.846f, -0.816f)
                moveTo(4.92f, 10.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 4.0f, 13.0f)
                lineTo(1.0f, 13.0f)
                curveToRelative(0.0f, -0.26f, 0.164f, -1.03f, 0.76f, -1.724f)
                curveToRelative(0.545f, -0.636f, 1.492f, -1.256f, 3.16f, -1.275f)
                close()
                moveTo(1.5f, 5.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                moveToRelative(3.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
            }
        }
        .build()
        return _people!!
    }

private var _people: ImageVector? = null
