package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = Builder(name = "Mountain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.18f, 10.95f)
                lineToRelative(2.54f, 3.175f)
                lineToRelative(0.084f, 0.093f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.403f, -0.01f)
                lineToRelative(1.637f, -1.638f)
                lineToRelative(1.324f, 1.985f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.457f, 0.226f)
                lineToRelative(3.632f, -2.906f)
                lineToRelative(3.647f, 7.697f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.904f, 1.428f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.904f, -1.428f)
                close()
                moveTo(12.0f, 3.072f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 2.983f, 1.888f)
                lineToRelative(2.394f, 5.057f)
                lineToRelative(-3.15f, 2.52f)
                lineToRelative(-1.395f, -2.092f)
                lineToRelative(-0.075f, -0.099f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.464f, -0.053f)
                lineToRelative(-1.711f, 1.709f)
                lineToRelative(-1.301f, -1.627f)
                lineToRelative(-1.151f, -1.435f)
                lineToRelative(1.888f, -3.98f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 2.982f, -1.888f)
            }
        }
        .build()
        return _mountain!!
    }

private var _mountain: ImageVector? = null
