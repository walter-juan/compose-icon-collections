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

public val SolidGroup.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 80.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                close()
                moveTo(16.0f, 448.0f)
                lineToRelative(0.0f, -288.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(126.2f, -84.2f)
                curveToRelative(10.7f, -7.2f, 24.8f, -7.2f, 35.5f, 0.0f)
                lineToRelative(126.2f, 84.2f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, 288.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(80.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                close()
                moveTo(560.0f, 112.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 32.0f)
                close()
                moveTo(224.0f, 384.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.7f, -64.0f, 64.0f)
                close()
                moveTo(288.0f, 232.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
