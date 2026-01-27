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

public val SolidGroup.Burger: ImageVector
    get() {
        if (_burger != null) {
            return _burger!!
        }
        _burger = Builder(name = "Burger", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 384.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(48.0f, 384.0f)
                close()
                moveTo(32.0f, 202.0f)
                curveToRelative(0.0f, 12.2f, 9.9f, 22.0f, 22.0f, 22.0f)
                lineTo(458.0f, 224.0f)
                curveToRelative(12.2f, 0.0f, 22.0f, -9.9f, 22.0f, -22.0f)
                curveToRelative(0.0f, -17.2f, -2.6f, -34.4f, -10.8f, -49.5f)
                curveToRelative(-22.2f, -40.8f, -82.3f, -120.5f, -213.2f, -120.5f)
                reflectiveCurveTo(65.0f, 111.6f, 42.8f, 152.5f)
                curveTo(34.6f, 167.6f, 32.0f, 184.8f, 32.0f, 202.0f)
                close()
                moveTo(0.0f, 304.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(448.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 272.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(256.0f, 72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(120.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(368.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _burger!!
    }

private var _burger: ImageVector? = null
