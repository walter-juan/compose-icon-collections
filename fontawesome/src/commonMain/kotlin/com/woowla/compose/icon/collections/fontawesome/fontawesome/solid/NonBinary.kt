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

public val SolidGroup.NonBinary: ImageVector
    get() {
        if (_nonBinary != null) {
            return _nonBinary!!
        }
        _nonBinary = Builder(name = "NonBinary", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 544.0f)
                curveToRelative(-97.2f, 0.0f, -176.0f, -78.8f, -176.0f, -176.0f)
                curveToRelative(0.0f, -86.3f, 62.1f, -158.0f, 144.0f, -173.0f)
                lineToRelative(0.0f, -47.2f)
                lineToRelative(-49.7f, 24.8f)
                lineToRelative(-3.0f, 1.3f)
                curveToRelative(-15.2f, 5.7f, -32.5f, -0.8f, -39.9f, -15.7f)
                curveToRelative(-7.4f, -14.8f, -2.2f, -32.6f, 11.5f, -41.3f)
                lineToRelative(2.8f, -1.6f)
                lineToRelative(38.8f, -19.4f)
                lineToRelative(-38.8f, -19.4f)
                curveToRelative(-15.8f, -7.9f, -22.2f, -27.1f, -14.3f, -42.9f)
                curveToRelative(7.4f, -14.8f, 24.8f, -21.4f, 40.0f, -15.6f)
                lineToRelative(3.0f, 1.3f)
                lineToRelative(49.7f, 24.8f)
                lineToRelative(0.0f, -44.2f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 44.2f)
                lineToRelative(49.7f, -24.8f)
                lineToRelative(3.0f, -1.3f)
                curveToRelative(15.2f, -5.8f, 32.5f, 0.8f, 39.9f, 15.6f)
                reflectiveCurveToRelative(2.2f, 32.7f, -11.5f, 41.3f)
                lineToRelative(-2.8f, 1.6f)
                lineToRelative(-38.7f, 19.4f)
                lineToRelative(38.7f, 19.3f)
                curveToRelative(15.8f, 7.9f, 22.2f, 27.1f, 14.3f, 42.9f)
                curveToRelative(-7.4f, 14.8f, -24.7f, 21.4f, -39.9f, 15.6f)
                lineToRelative(-3.0f, -1.3f)
                lineToRelative(-49.7f, -24.8f)
                lineToRelative(0.0f, 47.2f)
                curveToRelative(81.9f, 15.1f, 144.0f, 86.8f, 144.0f, 173.0f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                close()
                moveTo(192.0f, 480.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, -224.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, 224.0f)
                close()
            }
        }
        .build()
        return _nonBinary!!
    }

private var _nonBinary: ImageVector? = null
