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

public val Simpleicons.Guitarpro: ImageVector
    get() {
        if (_guitarpro != null) {
            return _guitarpro!!
        }
        _guitarpro = Builder(name = "Guitarpro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 0.0f)
                curveTo(6.422f, 0.0f, 1.773f, 3.573f, 1.773f, 7.295f)
                reflectiveCurveTo(8.561f, 23.973f, 11.998f, 24.0f)
                curveToRelative(3.435f, 0.027f, 10.218f, -12.971f, 10.229f, -16.705f)
                curveTo(22.227f, 3.575f, 17.575f, 0.0f, 11.998f, 0.0f)
                close()
                moveTo(15.84f, 5.078f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, true, 2.389f, 2.34f)
                lineToRelative(0.007f, 1.783f)
                arcToRelative(2.267f, 2.267f, 0.0f, false, true, -2.265f, 2.342f)
                arcToRelative(2.364f, 2.364f, 0.0f, false, true, -1.772f, -0.799f)
                verticalLineToRelative(3.115f)
                lineToRelative(-1.746f, 0.239f)
                lineTo(12.453f, 5.375f)
                lineToRelative(1.688f, -0.287f)
                lineToRelative(0.058f, 0.785f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, true, 1.64f, -0.795f)
                close()
                moveTo(10.285f, 5.113f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-0.005f, 5.953f)
                curveToRelative(0.0f, 1.736f, -0.931f, 2.973f, -2.58f, 2.973f)
                arcToRelative(4.946f, 4.946f, 0.0f, false, true, -2.423f, -0.523f)
                lineToRelative(0.207f, -1.748f)
                arcToRelative(3.297f, 3.297f, 0.0f, false, false, 1.996f, 0.843f)
                arcToRelative(0.946f, 0.946f, 0.0f, false, false, 1.056f, -0.998f)
                verticalLineToRelative(-0.904f)
                lineToRelative(-0.011f, 0.014f)
                arcToRelative(2.333f, 2.333f, 0.0f, false, true, -1.77f, 0.806f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, -2.26f, -2.345f)
                lineTo(6.195f, 7.47f)
                arcToRelative(2.285f, 2.285f, 0.0f, false, true, 4.03f, -1.551f)
                close()
                moveTo(9.082f, 6.385f)
                arcToRelative(1.156f, 1.156f, 0.0f, false, false, -1.139f, 1.273f)
                verticalLineToRelative(1.26f)
                arcToRelative(1.164f, 1.164f, 0.0f, false, false, 1.139f, 1.258f)
                arcToRelative(1.183f, 1.183f, 0.0f, false, false, 1.154f, -1.139f)
                lineTo(10.236f, 7.55f)
                arcToRelative(1.158f, 1.158f, 0.0f, false, false, -1.154f, -1.153f)
                close()
                moveTo(15.062f, 6.393f)
                arcToRelative(1.152f, 1.152f, 0.0f, false, false, -0.874f, 1.228f)
                verticalLineToRelative(1.33f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, 1.152f, 1.26f)
                arcToRelative(1.166f, 1.166f, 0.0f, false, false, 1.14f, -1.26f)
                verticalLineToRelative(-1.33f)
                arcToRelative(1.152f, 1.152f, 0.0f, false, false, -1.418f, -1.228f)
                close()
            }
        }
        .build()
        return _guitarpro!!
    }

private var _guitarpro: ImageVector? = null
