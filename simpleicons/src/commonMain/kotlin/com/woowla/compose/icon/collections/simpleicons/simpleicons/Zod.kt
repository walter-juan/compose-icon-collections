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

public val Simpleicons.Zod: ImageVector
    get() {
        if (_zod != null) {
            return _zod!!
        }
        _zod = Builder(name = "Zod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.584f, 3.582f)
                arcToRelative(2.247f, 2.247f, 0.0f, false, true, 2.112f, -1.479f)
                horizontalLineToRelative(14.617f)
                curveToRelative(0.948f, 0.0f, 1.794f, 0.595f, 2.115f, 1.487f)
                lineToRelative(2.44f, 6.777f)
                arcToRelative(2.248f, 2.248f, 0.0f, false, true, -0.624f, 2.443f)
                lineToRelative(-9.61f, 8.52f)
                arcToRelative(2.247f, 2.247f, 0.0f, false, true, -2.963f, 0.018f)
                lineTo(0.776f, 12.773f)
                arcToRelative(2.248f, 2.248f, 0.0f, false, true, -0.64f, -2.467f)
                close()
                moveTo(14.622f, 8.469f)
                lineTo(5.512f, 14.006f)
                lineTo(11.252f, 19.013f)
                curveToRelative(0.456f, 0.399f, 1.139f, 0.396f, 1.593f, -0.006f)
                lineToRelative(5.643f, -5.001f)
                lineTo(14.4f, 14.006f)
                lineToRelative(6.239f, -3.957f)
                curveToRelative(0.488f, -0.328f, 0.69f, -0.947f, 0.491f, -1.5f)
                lineToRelative(-1.24f, -3.446f)
                arcToRelative(1.535f, 1.535f, 0.0f, false, false, -1.456f, -1.015f)
                lineTo(5.545f, 4.088f)
                arcToRelative(1.535f, 1.535f, 0.0f, false, false, -1.431f, 1.01f)
                lineToRelative(-1.228f, 3.37f)
                close()
            }
        }
        .build()
        return _zod!!
    }

private var _zod: ImageVector? = null
