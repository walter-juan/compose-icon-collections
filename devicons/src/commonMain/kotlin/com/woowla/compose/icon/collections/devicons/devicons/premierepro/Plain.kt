package com.woowla.compose.icon.collections.devicons.devicons.premierepro

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
import com.woowla.compose.icon.collections.devicons.devicons.PremiereproGroup

public val PremiereproGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF2A0634)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.3f, 38.5f)
                horizontalLineToRelative(-7.4f)
                verticalLineToRelative(20.7f)
                horizontalLineToRelative(7.4f)
                curveToRelative(5.0f, 0.0f, 9.1f, -4.1f, 9.1f, -9.1f)
                verticalLineToRelative(-2.4f)
                curveToRelative(0.0f, -5.1f, -4.1f, -9.2f, -9.1f, -9.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2A0634)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                lineTo(128.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(51.2f, 67.5f)
                horizontalLineToRelative(-8.3f)
                verticalLineToRelative(21.3f)
                horizontalLineToRelative(-9.6f)
                lineTo(33.3f, 30.3f)
                horizontalLineToRelative(18.5f)
                curveToRelative(9.4f, -0.1f, 17.1f, 7.4f, 17.2f, 16.8f)
                verticalLineToRelative(2.3f)
                curveToRelative(0.0f, 9.9f, -8.0f, 18.0f, -17.8f, 18.1f)
                close()
                moveTo(97.3f, 53.3f)
                reflectiveCurveToRelative(-7.0f, 0.0f, -10.1f, 1.3f)
                verticalLineToRelative(34.2f)
                lineTo(77.1f, 88.8f)
                lineTo(77.1f, 48.9f)
                reflectiveCurveToRelative(10.2f, -5.1f, 20.2f, -3.8f)
                verticalLineToRelative(8.2f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
