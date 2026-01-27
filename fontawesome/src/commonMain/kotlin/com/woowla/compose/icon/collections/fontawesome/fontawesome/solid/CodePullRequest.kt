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

public val SolidGroup.CodePullRequest: ImageVector
    get() {
        if (_codePullRequest != null) {
            return _codePullRequest!!
        }
        _codePullRequest = Builder(name = "CodePullRequest", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(328.0f, 24.0f)
                curveToRelative(0.0f, -9.7f, -5.8f, -18.5f, -14.8f, -22.2f)
                reflectiveCurveTo(293.9f, 0.2f, 287.0f, 7.0f)
                lineTo(231.0f, 63.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(56.0f, 56.0f)
                curveToRelative(6.9f, 6.9f, 17.2f, 8.9f, 26.2f, 5.2f)
                reflectiveCurveTo(328.0f, 145.7f, 328.0f, 136.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(24.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 214.7f)
                curveToRelative(-28.3f, 12.3f, -48.0f, 40.5f, -48.0f, 73.3f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -32.8f, -19.7f, -61.0f, -48.0f, -73.3f)
                lineTo(448.0f, 144.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(0.0f, -24.0f)
                close()
                moveTo(72.0f, 80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(128.0f, 153.3f)
                curveToRelative(28.3f, -12.3f, 48.0f, -40.5f, 48.0f, -73.3f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveTo(16.0f, 35.8f, 16.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, 19.7f, 61.0f, 48.0f, 73.3f)
                lineToRelative(0.0f, 205.3f)
                curveToRelative(-28.3f, 12.3f, -48.0f, 40.5f, -48.0f, 73.3f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -32.8f, -19.7f, -61.0f, -48.0f, -73.3f)
                lineToRelative(0.0f, -205.3f)
                close()
                moveTo(72.0f, 432.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(416.0f, 408.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _codePullRequest!!
    }

private var _codePullRequest: ImageVector? = null
