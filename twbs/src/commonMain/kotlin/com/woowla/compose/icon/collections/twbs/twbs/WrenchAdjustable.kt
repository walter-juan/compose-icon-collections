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

public val Twbs.WrenchAdjustable: ImageVector
    get() {
        if (_wrenchAdjustable != null) {
            return _wrenchAdjustable!!
        }
        _wrenchAdjustable = Builder(name = "WrenchAdjustable", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.703f, 3.526f)
                lineTo(13.0f, 5.0f)
                lineToRelative(2.959f, -1.11f)
                quadToRelative(0.04f, 0.3f, 0.041f, 0.61f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 9.0f)
                curveToRelative(0.653f, 0.0f, 1.273f, -0.139f, 1.833f, -0.39f)
                lineTo(12.0f, 5.5f)
                lineTo(11.0f, 3.0f)
                lineToRelative(3.826f, -1.53f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 7.29f, 6.092f)
                lineToRelative(-6.116f, 5.096f)
                arcToRelative(2.583f, 2.583f, 0.0f, true, false, 3.638f, 3.638f)
                lineTo(9.908f, 8.71f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 11.5f, 9.0f)
                moveToRelative(-1.292f, -4.361f)
                lineToRelative(-0.596f, 0.893f)
                lineToRelative(0.809f, -0.27f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.287f, 0.377f)
                lineToRelative(-0.596f, 0.893f)
                lineToRelative(0.809f, -0.27f)
                lineToRelative(0.158f, 0.475f)
                lineToRelative(-1.5f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.287f, -0.376f)
                lineToRelative(0.596f, -0.893f)
                lineToRelative(-0.809f, 0.27f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.287f, -0.377f)
                lineToRelative(0.596f, -0.893f)
                lineToRelative(-0.809f, 0.27f)
                lineToRelative(-0.158f, -0.475f)
                lineToRelative(1.5f, -0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.287f, 0.376f)
                moveTo(3.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
            }
        }
        .build()
        return _wrenchAdjustable!!
    }

private var _wrenchAdjustable: ImageVector? = null
