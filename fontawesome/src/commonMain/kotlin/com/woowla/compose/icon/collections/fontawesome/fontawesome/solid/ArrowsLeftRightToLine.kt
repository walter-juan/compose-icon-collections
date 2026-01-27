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

public val SolidGroup.ArrowsLeftRightToLine: ImageVector
    get() {
        if (_arrowsLeftRightToLine != null) {
            return _arrowsLeftRightToLine!!
        }
        _arrowsLeftRightToLine = Builder(name = "ArrowsLeftRightToLine", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 110.3f, 0.0f, 128.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(390.6f, 342.6f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(9.4f, 9.4f)
                lineToRelative(-133.5f, 0.0f)
                lineToRelative(9.4f, -9.4f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-6.0f, 6.0f, -9.4f, 14.1f, -9.4f, 22.6f)
                reflectiveCurveToRelative(3.4f, 16.6f, 9.4f, 22.6f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-9.4f, -9.4f)
                lineToRelative(133.5f, 0.0f)
                lineToRelative(-9.4f, 9.4f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(32.8f, 12.5f, 45.3f, 0.0f)
                close()
                moveTo(576.0f, 128.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -256.0f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightToLine!!
    }

private var _arrowsLeftRightToLine: ImageVector? = null
