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

public val SolidGroup.CodeFork: ImageVector
    get() {
        if (_codeFork != null) {
            return _codeFork!!
        }
        _codeFork = Builder(name = "CodeFork", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(160.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, -19.7f, 61.0f, -48.0f, 73.3f)
                lineToRelative(0.0f, 22.7f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -22.7f)
                curveToRelative(-28.3f, -12.3f, -48.0f, -40.5f, -48.0f, -73.3f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, -19.7f, 61.0f, -48.0f, 73.3f)
                lineToRelative(0.0f, 22.7f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 70.7f)
                curveToRelative(28.3f, 12.3f, 48.0f, 40.5f, 48.0f, 73.3f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -32.8f, 19.7f, -61.0f, 48.0f, -73.3f)
                lineToRelative(0.0f, -70.7f)
                lineToRelative(-32.0f, 0.0f)
                curveTo(98.1f, 288.0f, 48.0f, 237.9f, 48.0f, 176.0f)
                lineToRelative(0.0f, -22.7f)
                curveTo(19.7f, 141.0f, 0.0f, 112.8f, 0.0f, 80.0f)
                curveTo(0.0f, 35.8f, 35.8f, 0.0f, 80.0f, 0.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                close()
                moveTo(368.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(248.0f, 432.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _codeFork!!
    }

private var _codeFork: ImageVector? = null
