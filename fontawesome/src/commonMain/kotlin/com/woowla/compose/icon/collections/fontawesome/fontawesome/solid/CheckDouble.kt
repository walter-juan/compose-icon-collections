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

public val SolidGroup.CheckDouble: ImageVector
    get() {
        if (_checkDouble != null) {
            return _checkDouble!!
        }
        _checkDouble = Builder(name = "CheckDouble", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.9f, 66.8f)
                curveToRelative(10.4f, -14.3f, 7.2f, -34.3f, -7.1f, -44.7f)
                reflectiveCurveToRelative(-34.3f, -7.2f, -44.7f, 7.1f)
                lineToRelative(-106.0f, 145.7f)
                lineToRelative(-37.5f, -37.5f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(6.6f, 6.6f, 15.8f, 10.0f, 25.1f, 9.3f)
                reflectiveCurveToRelative(17.9f, -5.5f, 23.4f, -13.1f)
                lineToRelative(128.0f, -176.0f)
                close()
                moveTo(377.9f, 202.8f)
                curveToRelative(10.4f, -14.3f, 7.2f, -34.3f, -7.1f, -44.7f)
                reflectiveCurveToRelative(-34.3f, -7.2f, -44.7f, 7.1f)
                lineToRelative(-170.0f, 233.7f)
                lineToRelative(-69.5f, -69.5f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(96.0f, 96.0f)
                curveToRelative(6.6f, 6.6f, 15.8f, 10.0f, 25.1f, 9.3f)
                reflectiveCurveToRelative(17.9f, -5.5f, 23.4f, -13.1f)
                lineToRelative(192.0f, -264.0f)
                close()
            }
        }
        .build()
        return _checkDouble!!
    }

private var _checkDouble: ImageVector? = null
