package com.woowla.compose.icon.collections.devicons.devicons.bitbucket

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.BitbucketGroup

public val BitbucketGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF2684ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.08f, 20.0f)
                curveToRelative(-1.92f, 0.0f, -3.36f, 1.76f, -3.04f, 3.52f)
                lineToRelative(12.95f, 79.29f)
                curveToRelative(0.32f, 2.08f, 2.08f, 3.52f, 4.16f, 3.52f)
                horizontalLineToRelative(62.66f)
                curveToRelative(1.44f, 0.0f, 2.72f, -1.12f, 3.04f, -2.56f)
                lineToRelative(13.11f, -80.09f)
                curveToRelative(0.32f, -1.92f, -1.12f, -3.52f, -3.04f, -3.52f)
                close()
                moveTo(74.07f, 77.23f)
                lineTo(54.09f, 77.23f)
                lineToRelative(-5.28f, -28.29f)
                horizontalLineToRelative(30.22f)
                close()
                moveTo(74.07f, 77.23f)
            }
            path(fill = linearGradient(0.18f to Color(0xFF0052CC), 1.0f to Color(0xFF2684FF), start
                    = Offset(114.37f,56.9f), end = Offset(66.69f,94.13f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(107.64f, 48.93f)
                lineTo(78.87f, 48.93f)
                lineTo(74.07f, 77.23f)
                lineTo(54.09f, 77.23f)
                lineToRelative(-23.5f, 27.97f)
                reflectiveCurveToRelative(1.12f, 0.96f, 2.72f, 0.96f)
                horizontalLineToRelative(62.66f)
                curveToRelative(1.44f, 0.0f, 2.72f, -1.12f, 3.04f, -2.56f)
                close()
                moveTo(107.64f, 48.93f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
