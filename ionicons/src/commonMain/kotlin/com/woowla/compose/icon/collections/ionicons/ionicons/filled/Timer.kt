package com.woowla.compose.icon.collections.ionicons.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.12f, 48.0f, 48.0f, 141.12f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.12f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.12f, 208.0f, -208.0f)
                reflectiveCurveTo(370.88f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(173.67f, 162.34f)
                lineToRelative(105.0f, 71.0f)
                arcToRelative(32.5f, 32.5f, 0.0f, false, true, -37.25f, 53.26f)
                arcToRelative(33.21f, 33.21f, 0.0f, false, true, -8.0f, -8.0f)
                lineToRelative(-71.0f, -105.0f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, 11.32f, -11.32f)
                close()
                moveTo(256.0f, 432.0f)
                curveTo(159.0f, 432.0f, 80.0f, 353.05f, 80.0f, 256.0f)
                arcToRelative(174.55f, 174.55f, 0.0f, false, true, 53.87f, -126.72f)
                arcToRelative(14.15f, 14.15f, 0.0f, true, true, 19.64f, 20.37f)
                arcTo(146.53f, 146.53f, 0.0f, false, false, 108.3f, 256.0f)
                curveToRelative(0.0f, 81.44f, 66.26f, 147.7f, 147.7f, 147.7f)
                reflectiveCurveTo(403.7f, 337.44f, 403.7f, 256.0f)
                curveToRelative(0.0f, -76.67f, -58.72f, -139.88f, -133.55f, -147.0f)
                verticalLineTo(164.0f)
                arcToRelative(14.15f, 14.15f, 0.0f, true, true, -28.3f, 0.0f)
                verticalLineTo(94.15f)
                arcTo(14.15f, 14.15f, 0.0f, false, true, 256.0f, 80.0f)
                curveTo(353.05f, 80.0f, 432.0f, 159.0f, 432.0f, 256.0f)
                reflectiveCurveTo(353.05f, 432.0f, 256.0f, 432.0f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
