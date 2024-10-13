package com.woowla.compose.icon.collections.devicons.devicons.couchdb

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CouchdbGroup

public val CouchdbGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(101.4f, 77.2f)
                curveToRelative(0.0f, 5.0f, -2.7f, 7.5f, -7.6f, 7.7f)
                lineTo(33.9f, 84.9f)
                curveToRelative(-4.9f, 0.0f, -7.6f, -2.5f, -7.6f, -7.7f)
                curveToRelative(0.0f, -5.0f, 2.7f, -7.5f, 7.6f, -7.7f)
                horizontalLineToRelative(60.2f)
                curveToRelative(4.9f, 0.2f, 7.3f, 2.7f, 7.3f, 7.7f)
                close()
                moveTo(94.1f, 88.7f)
                lineTo(33.9f, 88.7f)
                curveToRelative(-4.9f, 0.0f, -7.6f, 2.4f, -7.6f, 7.7f)
                curveToRelative(0.0f, 5.0f, 2.7f, 7.4f, 7.6f, 7.7f)
                horizontalLineToRelative(60.2f)
                curveToRelative(4.9f, 0.0f, 7.6f, -2.5f, 7.6f, -7.7f)
                curveToRelative(-0.3f, -5.3f, -2.7f, -7.7f, -7.6f, -7.7f)
                close()
                moveTo(112.7f, 46.6f)
                curveToRelative(-4.9f, 0.0f, -7.6f, 2.5f, -7.6f, 7.4f)
                verticalLineToRelative(42.1f)
                curveToRelative(0.0f, 5.0f, 2.7f, 7.5f, 7.6f, 7.7f)
                curveToRelative(7.4f, -0.2f, 11.3f, -7.7f, 11.3f, -22.9f)
                lineTo(124.0f, 62.0f)
                curveToRelative(0.0f, -10.2f, -3.9f, -15.2f, -11.3f, -15.4f)
                close()
                moveTo(15.3f, 46.6f)
                curveTo(7.9f, 46.8f, 4.0f, 51.8f, 4.0f, 62.0f)
                verticalLineToRelative(18.9f)
                curveToRelative(0.0f, 15.2f, 3.9f, 22.7f, 11.3f, 22.9f)
                curveToRelative(4.9f, 0.0f, 7.6f, -2.4f, 7.6f, -7.7f)
                lineTo(22.9f, 54.3f)
                curveToRelative(-0.2f, -5.0f, -2.7f, -7.5f, -7.6f, -7.7f)
                close()
                moveTo(112.7f, 42.8f)
                curveToRelative(0.0f, -12.7f, -6.6f, -18.7f, -18.6f, -18.9f)
                lineTo(33.9f, 23.9f)
                curveToRelative(-12.2f, 0.2f, -18.6f, 6.5f, -18.6f, 18.9f)
                curveToRelative(7.4f, 0.0f, 11.3f, 4.0f, 11.3f, 11.5f)
                reflectiveCurveToRelative(3.9f, 11.4f, 11.3f, 11.4f)
                horizontalLineToRelative(52.5f)
                curveToRelative(7.3f, 0.0f, 11.3f, -3.9f, 11.3f, -11.4f)
                curveToRelative(-0.3f, -7.7f, 3.9f, -11.2f, 11.0f, -11.5f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
