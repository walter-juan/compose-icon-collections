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

public val SolidGroup.SkullCrossbones: ImageVector
    get() {
        if (_skullCrossbones != null) {
            return _skullCrossbones!!
        }
        _skullCrossbones = Builder(name = "SkullCrossbones", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 144.0f)
                curveTo(384.0f, 64.5f, 312.4f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(64.0f, 64.5f, 64.0f, 144.0f)
                curveToRelative(0.0f, 47.1f, 25.1f, 88.9f, 64.0f, 115.2f)
                lineToRelative(0.0f, 28.8f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -28.8f)
                curveToRelative(38.9f, -26.3f, 64.0f, -68.1f, 64.0f, -115.2f)
                close()
                moveTo(160.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(256.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(445.5f, 339.7f)
                curveToRelative(-6.8f, -16.3f, -25.5f, -24.0f, -41.8f, -17.2f)
                lineTo(224.0f, 397.3f)
                lineTo(44.3f, 322.5f)
                curveToRelative(-16.3f, -6.8f, -35.0f, 0.9f, -41.8f, 17.2f)
                reflectiveCurveToRelative(0.9f, 35.0f, 17.2f, 41.8f)
                lineTo(140.8f, 432.0f)
                lineTo(19.7f, 482.5f)
                curveTo(3.4f, 489.3f, -4.3f, 508.0f, 2.5f, 524.3f)
                reflectiveCurveToRelative(25.5f, 24.0f, 41.8f, 17.2f)
                lineTo(224.0f, 466.7f)
                lineTo(403.7f, 541.5f)
                curveToRelative(16.3f, 6.8f, 35.0f, -0.9f, 41.8f, -17.2f)
                reflectiveCurveToRelative(-0.9f, -35.0f, -17.2f, -41.8f)
                lineTo(307.2f, 432.0f)
                lineTo(428.3f, 381.5f)
                curveToRelative(16.3f, -6.8f, 24.0f, -25.5f, 17.2f, -41.8f)
                close()
            }
        }
        .build()
        return _skullCrossbones!!
    }

private var _skullCrossbones: ImageVector? = null
