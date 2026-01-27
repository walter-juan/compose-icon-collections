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

public val SolidGroup.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(name = "Virus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 40.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.9f, -40.0f, 40.0f)
                curveToRelative(0.0f, 44.1f, -53.3f, 66.1f, -84.5f, 35.0f)
                curveToRelative(-15.6f, -15.6f, -40.9f, -15.6f, -56.6f, 0.0f)
                reflectiveCurveToRelative(-15.6f, 40.9f, 0.0f, 56.6f)
                curveToRelative(31.2f, 31.2f, 9.1f, 84.5f, -35.0f, 84.5f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                reflectiveCurveToRelative(17.9f, 40.0f, 40.0f, 40.0f)
                curveToRelative(44.1f, 0.0f, 66.1f, 53.3f, 35.0f, 84.5f)
                curveToRelative(-15.6f, 15.6f, -15.6f, 40.9f, 0.0f, 56.6f)
                reflectiveCurveToRelative(40.9f, 15.6f, 56.6f, 0.0f)
                curveToRelative(31.2f, -31.2f, 84.5f, -9.1f, 84.5f, 35.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                reflectiveCurveToRelative(40.0f, -17.9f, 40.0f, -40.0f)
                curveToRelative(0.0f, -44.1f, 53.3f, -66.1f, 84.5f, -35.0f)
                curveToRelative(15.6f, 15.6f, 40.9f, 15.6f, 56.6f, 0.0f)
                reflectiveCurveToRelative(15.6f, -40.9f, 0.0f, -56.6f)
                curveToRelative(-31.2f, -31.2f, -9.1f, -84.5f, 35.0f, -84.5f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                reflectiveCurveToRelative(-17.9f, -40.0f, -40.0f, -40.0f)
                curveToRelative(-44.1f, 0.0f, -66.1f, -53.3f, -35.0f, -84.5f)
                curveToRelative(15.6f, -15.6f, 15.6f, -40.9f, 0.0f, -56.6f)
                reflectiveCurveToRelative(-40.9f, -15.6f, -56.6f, 0.0f)
                curveTo(349.3f, 106.1f, 296.0f, 84.1f, 296.0f, 40.0f)
                close()
                moveTo(160.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(320.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
