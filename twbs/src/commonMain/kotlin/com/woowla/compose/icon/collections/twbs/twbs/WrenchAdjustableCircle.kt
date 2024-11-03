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

public val Twbs.WrenchAdjustableCircle: ImageVector
    get() {
        if (_wrenchAdjustableCircle != null) {
            return _wrenchAdjustableCircle!!
        }
        _wrenchAdjustableCircle = Builder(name = "WrenchAdjustableCircle", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.496f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.703f, 3.526f)
                lineTo(9.497f, 8.5f)
                lineToRelative(2.959f, -1.11f)
                quadToRelative(0.04f, 0.3f, 0.04f, 0.61f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -13.202f, 3.249f)
                lineToRelative(1.988f, -1.657f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 7.537f, -4.623f)
                lineTo(7.497f, 6.5f)
                lineToRelative(1.0f, 2.5f)
                lineToRelative(1.333f, 3.11f)
                curveToRelative(-0.56f, 0.251f, -1.18f, 0.39f, -1.833f, 0.39f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.592f, -0.29f)
                lineTo(4.747f, 14.2f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 15.0f, 8.0f)
                moveToRelative(-8.295f, 0.139f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.288f, -0.376f)
                lineToRelative(-1.5f, 0.5f)
                lineToRelative(0.159f, 0.474f)
                lineToRelative(0.808f, -0.27f)
                lineToRelative(-0.595f, 0.894f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.287f, 0.376f)
                lineToRelative(0.808f, -0.27f)
                lineToRelative(-0.595f, 0.894f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.287f, 0.376f)
                lineToRelative(1.5f, -0.5f)
                lineToRelative(-0.159f, -0.474f)
                lineToRelative(-0.808f, 0.27f)
                lineToRelative(0.596f, -0.894f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.288f, -0.376f)
                lineToRelative(-0.808f, 0.27f)
                close()
            }
        }
        .build()
        return _wrenchAdjustableCircle!!
    }

private var _wrenchAdjustableCircle: ImageVector? = null
