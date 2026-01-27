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

public val SolidGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 112.0f)
                curveTo(0.0f, 70.5f, 31.6f, 36.4f, 72.0f, 32.4f)
                lineToRelative(0.0f, -0.4f)
                lineToRelative(280.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 176.0f)
                lineToRelative(-176.0f, 0.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, 32.2f, -72.0f, 72.0f)
                lineToRelative(0.0f, 60.0f)
                curveToRelative(0.0f, 24.3f, -19.7f, 44.0f, -44.0f, 44.0f)
                reflectiveCurveToRelative(-44.0f, -19.7f, -44.0f, -44.0f)
                lineToRelative(0.0f, -228.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -48.0f)
                close()
                moveTo(236.8f, 480.0f)
                curveToRelative(7.1f, -13.1f, 11.2f, -28.1f, 11.2f, -44.0f)
                lineToRelative(0.0f, -60.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(248.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                lineToRelative(-227.2f, 0.0f)
                close()
                moveTo(80.0f, 80.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
