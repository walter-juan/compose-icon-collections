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

public val SolidGroup.Bridge: ImageVector
    get() {
        if (_bridge != null) {
            return _bridge!!
        }
        _bridge = Builder(name = "Bridge", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                curveTo(14.3f, 32.0f, 0.0f, 46.3f, 0.0f, 64.0f)
                reflectiveCurveTo(14.3f, 96.0f, 32.0f, 96.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineTo(0.0f, 160.0f)
                lineTo(0.0f, 288.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(-72.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(40.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 32.0f)
                close()
                moveTo(456.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                close()
                moveTo(328.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                close()
                moveTo(200.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bridge!!
    }

private var _bridge: ImageVector? = null
