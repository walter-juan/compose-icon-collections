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

public val Simpleicons.Modal: ImageVector
    get() {
        if (_modal != null) {
            return _modal!!
        }
        _modal = Builder(name = "Modal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.89f, 5.57f)
                lineTo(0.0f, 14.002f)
                lineToRelative(2.521f, 4.4f)
                horizontalLineToRelative(5.05f)
                lineToRelative(4.396f, -7.718f)
                lineToRelative(4.512f, 7.709f)
                lineToRelative(4.996f, 0.037f)
                lineTo(24.0f, 14.057f)
                lineToRelative(-4.857f, -8.452f)
                lineToRelative(-5.073f, -0.015f)
                lineToRelative(-2.076f, 3.598f)
                lineTo(9.94f, 5.57f)
                close()
                moveTo(5.727f, 6.299f)
                horizontalLineToRelative(3.787f)
                lineToRelative(1.845f, 3.252f)
                lineTo(7.572f, 9.551f)
                close()
                moveTo(14.916f, 6.32f)
                lineTo(18.719f, 6.332f)
                lineTo(22.947f, 13.687f)
                lineTo(19.211f, 13.66f)
                close()
                moveTo(5.096f, 6.666f)
                lineTo(6.94f, 9.914f)
                lineToRelative(-4.209f, 7.389f)
                lineToRelative(-1.892f, -3.3f)
                close()
                moveTo(14.283f, 6.68f)
                lineTo(18.58f, 14.023f)
                lineTo(16.688f, 17.305f)
                lineTo(12.388f, 9.961f)
                close()
                moveTo(7.57f, 10.28f)
                horizontalLineToRelative(3.79f)
                lineToRelative(-4.212f, 7.394f)
                lineTo(3.361f, 17.674f)
                close()
                moveTo(19.21f, 14.389f)
                lineTo(22.95f, 14.416f)
                lineTo(21.057f, 17.697f)
                lineTo(17.317f, 17.67f)
                close()
            }
        }
        .build()
        return _modal!!
    }

private var _modal: ImageVector? = null
