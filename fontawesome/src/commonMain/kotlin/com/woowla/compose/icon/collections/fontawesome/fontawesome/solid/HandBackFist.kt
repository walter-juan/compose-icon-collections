package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.HandBackFist: ImageVector
    get() {
        if (_handBackFist != null) {
            return _handBackFist!!
        }
        _handBackFist = Builder(name = "HandBackFist", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4f, 253.6f)
                curveTo(2.6f, 245.9f, 0.0f, 237.1f, 0.0f, 228.0f)
                lineToRelative(0.0f, -36.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                curveToRelative(17.3f, 0.0f, 32.4f, 9.1f, 40.9f, 22.8f)
                curveToRelative(4.3f, -22.1f, 23.8f, -38.8f, 47.1f, -38.8f)
                curveToRelative(23.4f, 0.0f, 42.9f, 16.8f, 47.1f, 38.9f)
                curveToRelative(7.3f, -4.4f, 15.8f, -6.9f, 24.9f, -6.9f)
                curveToRelative(22.1f, 0.0f, 40.8f, 15.0f, 46.3f, 35.4f)
                curveToRelative(5.5f, -2.2f, 11.4f, -3.4f, 17.7f, -3.4f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 96.9f)
                curveToRelative(0.0f, 9.9f, -2.3f, 19.7f, -6.8f, 28.6f)
                lineToRelative(-39.6f, 79.1f)
                curveToRelative(-10.8f, 21.7f, -33.0f, 35.4f, -57.2f, 35.4f)
                lineTo(96.0f, 352.0f)
                curveToRelative(-16.5f, 0.0f, -31.8f, -8.4f, -40.6f, -22.4f)
                lineToRelative(-48.0f, -76.0f)
                close()
                moveTo(32.0f, 480.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _handBackFist!!
    }

private var _handBackFist: ImageVector? = null
