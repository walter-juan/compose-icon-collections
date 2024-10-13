package com.woowla.compose.icon.collections.devicons.devicons.behance

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
import com.woowla.compose.icon.collections.devicons.devicons.BehanceGroup

public val BehanceGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1d1d1b)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.53f, 48.26f)
                curveToRelative(0.0f, -7.16f, -4.87f, -7.16f, -4.87f, -7.16f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(15.35f)
                horizontalLineToRelative(18.76f)
                curveToRelative(3.24f, 0.0f, 6.11f, -1.04f, 6.11f, -8.19f)
                close()
                moveTo(43.66f, 67.06f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(18.38f)
                horizontalLineToRelative(19.1f)
                curveToRelative(2.87f, -0.08f, 8.18f, -1.0f, 8.18f, -8.94f)
                curveToRelative(-0.03f, -9.5f, -7.28f, -9.44f, -7.28f, -9.44f)
                close()
                moveTo(94.93f, 56.45f)
                curveToRelative(-10.63f, 0.0f, -12.11f, 10.6f, -12.11f, 10.6f)
                horizontalLineToRelative(22.6f)
                reflectiveCurveToRelative(0.14f, -10.6f, -10.49f, -10.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1d1d1b)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(111.25f, 2.16f)
                horizontalLineToRelative(-94.5f)
                arcTo(14.59f, 14.59f, 0.0f, false, false, 2.16f, 16.75f)
                verticalLineToRelative(94.49f)
                arcToRelative(14.59f, 14.59f, 0.0f, false, false, 14.59f, 14.59f)
                horizontalLineToRelative(94.49f)
                arcToRelative(14.59f, 14.59f, 0.0f, false, false, 14.59f, -14.59f)
                lineTo(125.83f, 16.75f)
                arcToRelative(14.59f, 14.59f, 0.0f, false, false, -14.58f, -14.59f)
                close()
                moveTo(79.86f, 32.92f)
                horizontalLineToRelative(28.38f)
                verticalLineToRelative(8.48f)
                lineTo(79.86f, 41.4f)
                close()
                moveTo(65.51f, 77.36f)
                curveToRelative(0.0f, 21.0f, -21.85f, 20.31f, -21.85f, 20.31f)
                lineTo(7.86f, 97.67f)
                verticalLineToRelative(-68.8f)
                horizontalLineToRelative(35.8f)
                curveToRelative(10.88f, 0.0f, 19.47f, 6.0f, 19.47f, 18.32f)
                reflectiveCurveToRelative(-10.5f, 13.09f, -10.5f, 13.09f)
                curveToRelative(13.84f, 0.0f, 12.88f, 17.08f, 12.88f, 17.08f)
                close()
                moveTo(118.6f, 76.24f)
                lineTo(83.0f, 76.24f)
                curveToRelative(0.0f, 12.78f, 12.11f, 12.0f, 12.11f, 12.0f)
                curveToRelative(11.43f, 0.0f, 11.0f, -7.4f, 11.0f, -7.4f)
                horizontalLineToRelative(12.09f)
                curveToRelative(0.0f, 19.64f, -23.54f, 18.29f, -23.54f, 18.29f)
                curveToRelative(-28.25f, 0.0f, -26.43f, -26.3f, -26.43f, -26.3f)
                reflectiveCurveToRelative(0.0f, -26.43f, 26.43f, -26.43f)
                curveToRelative(27.85f, -0.02f, 23.95f, 29.84f, 23.95f, 29.84f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
