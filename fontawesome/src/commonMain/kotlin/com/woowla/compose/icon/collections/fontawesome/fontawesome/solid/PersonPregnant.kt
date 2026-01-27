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

public val SolidGroup.PersonPregnant: ImageVector
    get() {
        if (_personPregnant != null) {
            return _personPregnant!!
        }
        _personPregnant = Builder(name = "PersonPregnant", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 80.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, -112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, 112.0f)
                close()
                moveTo(272.0f, 401.2f)
                curveToRelative(8.6f, -4.5f, 16.8f, -10.0f, 24.3f, -16.5f)
                lineToRelative(4.0f, -3.4f)
                curveToRelative(22.6f, -19.4f, 35.7f, -47.7f, 35.7f, -77.6f)
                curveToRelative(0.0f, -35.9f, -18.8f, -69.1f, -49.6f, -87.6f)
                lineToRelative(-30.4f, -18.2f)
                lineToRelative(0.0f, -1.8f)
                curveToRelative(0.0f, -46.5f, -37.7f, -84.1f, -84.1f, -84.1f)
                curveToRelative(-28.1f, 0.0f, -54.4f, 14.1f, -70.0f, 37.5f)
                lineTo(21.4f, 270.2f)
                curveToRelative(-9.8f, 14.7f, -5.8f, 34.6f, 8.9f, 44.4f)
                reflectiveCurveToRelative(34.6f, 5.8f, 44.4f, -8.9f)
                lineToRelative(29.0f, -43.5f)
                lineToRelative(-30.5f, 113.5f)
                curveToRelative(-2.6f, 9.6f, -0.6f, 19.9f, 5.5f, 27.8f)
                reflectiveCurveTo(94.0f, 416.0f, 104.0f, 416.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -110.8f)
                close()
            }
        }
        .build()
        return _personPregnant!!
    }

private var _personPregnant: ImageVector? = null
