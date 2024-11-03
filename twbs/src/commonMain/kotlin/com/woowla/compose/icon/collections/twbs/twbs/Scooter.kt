package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-0.39f)
                lineToRelative(1.4f, 7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -0.98f, 0.195f)
                lineToRelative(-0.189f, -0.938f)
                lineToRelative(-2.43f, 3.527f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 13.0f)
                lineTo(4.95f, 13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -1.0f)
                horizontalLineToRelative(4.287f)
                lineToRelative(2.831f, -4.11f)
                lineTo(11.09f, 3.0f)
                lineTo(9.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveTo(3.915f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 1.0f)
                lineTo(2.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                close()
                moveTo(12.732f, 11.211f)
                arcTo(1.499f, 1.499f, 0.0f, false, false, 13.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.213f, -2.985f)
                lineToRelative(0.277f, 1.387f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.98f, 0.196f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
