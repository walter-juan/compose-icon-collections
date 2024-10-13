package com.woowla.compose.icon.collections.devicons.devicons.circleci

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CircleciGroup

public val CircleciGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF343434)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.81f, 64.0f)
                curveToRelative(0.0f, -8.45f, 6.85f, -15.23f, 15.23f, -15.23f)
                curveToRelative(8.39f, 0.0f, 15.23f, 6.85f, 15.23f, 15.23f)
                reflectiveCurveTo(71.43f, 79.23f, 63.04f, 79.23f)
                curveToRelative(-8.38f, 0.0f, -15.23f, -6.85f, -15.23f, -15.23f)
                close()
                moveTo(63.04f, 0.0f)
                curveTo(33.15f, 0.0f, 8.13f, 20.48f, 1.02f, 48.13f)
                curveToRelative(-0.06f, 0.19f, -0.06f, 0.38f, -0.06f, 0.64f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, false, 3.07f, 3.07f)
                horizontalLineToRelative(25.79f)
                curveToRelative(1.22f, 0.0f, 2.31f, -0.7f, 2.75f, -1.79f)
                curveToRelative(5.31f, -11.52f, 16.96f, -19.58f, 30.47f, -19.58f)
                curveToRelative(18.5f, 0.0f, 33.53f, 15.04f, 33.53f, 33.53f)
                curveToRelative(0.0f, 18.5f, -15.04f, 33.53f, -33.53f, 33.53f)
                curveToRelative(-13.5f, 0.0f, -25.15f, -8.0f, -30.47f, -19.58f)
                curveToRelative(-0.51f, -1.02f, -1.53f, -1.79f, -2.75f, -1.79f)
                lineTo(4.03f, 76.16f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, false, -3.07f, 3.07f)
                curveToRelative(0.0f, 0.2f, 0.06f, 0.39f, 0.06f, 0.64f)
                curveTo(8.06f, 107.52f, 33.15f, 128.0f, 63.04f, 128.0f)
                curveToRelative(35.33f, 0.0f, 64.0f, -28.67f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.67f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(63.04f, 0.0f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
