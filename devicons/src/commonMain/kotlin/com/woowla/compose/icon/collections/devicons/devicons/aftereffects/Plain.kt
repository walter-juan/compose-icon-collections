package com.woowla.compose.icon.collections.devicons.devicons.aftereffects

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
import com.woowla.compose.icon.collections.devicons.devicons.AftereffectsGroup

public val AftereffectsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1F0740)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.0f, 52.4f)
                curveToRelative(-7.5f, 0.9f, -7.5f, 9.2f, -7.5f, 9.2f)
                horizontalLineToRelative(14.9f)
                curveToRelative(0.1f, 0.0f, 0.8f, -9.2f, -7.4f, -9.2f)
                close()
                moveTo(38.2f, 63.1f)
                horizontalLineTo(51.0f)
                lineToRelative(-6.4f, -24.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1F0740)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                lineTo(128.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(57.5f, 88.6f)
                lineTo(53.0f, 72.5f)
                lineTo(36.2f, 72.5f)
                lineToRelative(-4.4f, 16.1f)
                horizontalLineToRelative(-9.4f)
                lineToRelative(16.0f, -54.9f)
                verticalLineToRelative(-3.8f)
                horizontalLineToRelative(12.2f)
                lineToRelative(17.3f, 58.7f)
                lineTo(57.5f, 88.6f)
                close()
                moveTo(103.5f, 69.0f)
                horizontalLineToRelative(-24.0f)
                curveToRelative(1.9f, 19.2f, 21.2f, 10.0f, 21.2f, 10.0f)
                verticalLineToRelative(8.0f)
                reflectiveCurveToRelative(-1.3f, 2.6f, -14.8f, 2.6f)
                reflectiveCurveToRelative(-16.3f, -18.3f, -16.3f, -18.3f)
                verticalLineToRelative(-4.7f)
                reflectiveCurveToRelative(1.3f, -22.0f, 17.3f, -22.0f)
                reflectiveCurveToRelative(16.5f, 14.6f, 16.5f, 14.6f)
                lineTo(103.4f, 69.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
