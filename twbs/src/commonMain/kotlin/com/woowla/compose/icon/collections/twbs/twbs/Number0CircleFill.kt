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

public val Twbs.Number0CircleFill: ImageVector
    get() {
        if (_number0CircleFill != null) {
            return _number0CircleFill!!
        }
        _number0CircleFill = Builder(name = "Number0CircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.951f)
                curveToRelative(-1.008f, 0.0f, -1.629f, 1.09f, -1.629f, 2.895f)
                verticalLineToRelative(0.31f)
                curveToRelative(0.0f, 1.81f, 0.627f, 2.895f, 1.629f, 2.895f)
                reflectiveCurveToRelative(1.623f, -1.09f, 1.623f, -2.895f)
                verticalLineToRelative(-0.31f)
                curveToRelative(0.0f, -1.8f, -0.621f, -2.895f, -1.623f, -2.895f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-8.012f, 4.158f)
                curveToRelative(1.858f, 0.0f, 2.96f, -1.582f, 2.96f, -3.99f)
                verticalLineTo(7.84f)
                curveToRelative(0.0f, -2.426f, -1.079f, -3.996f, -2.936f, -3.996f)
                curveToRelative(-1.864f, 0.0f, -2.965f, 1.588f, -2.965f, 3.996f)
                verticalLineToRelative(0.328f)
                curveToRelative(0.0f, 2.42f, 1.09f, 3.99f, 2.941f, 3.99f)
            }
        }
        .build()
        return _number0CircleFill!!
    }

private var _number0CircleFill: ImageVector? = null
