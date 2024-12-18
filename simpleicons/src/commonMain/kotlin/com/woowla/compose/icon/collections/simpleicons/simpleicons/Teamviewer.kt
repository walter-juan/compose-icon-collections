package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Teamviewer: ImageVector
    get() {
        if (_teamviewer != null) {
            return _teamviewer!!
        }
        _teamviewer = Builder(name = "Teamviewer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.17f, 11.998f)
                lineToRelative(-6.225f, -3.401f)
                lineToRelative(0.685f, 2.144f)
                horizontalLineTo(9.37f)
                lineToRelative(0.684f, -2.145f)
                lineTo(3.829f, 12.0f)
                lineToRelative(6.225f, 3.404f)
                lineToRelative(-0.683f, -2.147f)
                horizontalLineToRelative(5.26f)
                lineToRelative(-0.686f, 2.147f)
                close()
                moveTo(20.448f, 0.0f)
                horizontalLineTo(3.553f)
                arcTo(3.553f, 3.553f, 0.0f, false, false, 0.001f, 3.552f)
                verticalLineToRelative(16.895f)
                arcTo(3.553f, 3.553f, 0.0f, false, false, 3.553f, 24.0f)
                horizontalLineToRelative(16.895f)
                arcTo(3.553f, 3.553f, 0.0f, false, false, 24.0f, 20.447f)
                verticalLineTo(3.552f)
                arcTo(3.553f, 3.553f, 0.0f, false, false, 20.448f, 0.0f)
                close()
                moveTo(12.0f, 21.646f)
                curveToRelative(-5.328f, 0.0f, -9.648f, -4.32f, -9.648f, -9.648f)
                curveToRelative(0.0f, -5.329f, 4.32f, -9.646f, 9.648f, -9.646f)
                reflectiveCurveTo(21.65f, 6.672f, 21.65f, 12.0f)
                reflectiveCurveToRelative(-4.32f, 9.648f, -9.649f, 9.648f)
                close()
            }
        }
        .build()
        return _teamviewer!!
    }

private var _teamviewer: ImageVector? = null
