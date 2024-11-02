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

public val Simpleicons.Knime: ImageVector
    get() {
        if (_knime != null) {
            return _knime!!
        }
        _knime = Builder(name = "Knime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.445f, 21.393f)
                lineToRelative(11.54f, -0.775f)
                lineToRelative(0.451f, 0.775f)
                close()
                moveTo(7.56f, 11.113f)
                lineToRelative(-5.092f, 10.28f)
                horizontalLineToRelative(-0.904f)
                close()
                moveTo(17.987f, 13.765f)
                lineTo(11.557f, 4.26f)
                lineTo(12.009f, 3.485f)
                close()
                moveTo(20.557f, 18.981f)
                lineTo(21.184f, 19.877f)
                lineTo(10.532f, 20.584f)
                close()
                moveTo(4.655f, 20.976f)
                lineToRelative(-1.143f, 0.09f)
                lineToRelative(4.709f, -9.488f)
                close()
                moveTo(10.828f, 6.309f)
                lineTo(11.304f, 5.311f)
                lineTo(17.288f, 14.093f)
                close()
                moveTo(19.1f, 17.364f)
                lineTo(19.947f, 18.379f)
                lineTo(11.262f, 19.792f)
                close()
                moveTo(6.76f, 20.532f)
                lineToRelative(-1.32f, 0.224f)
                lineToRelative(3.11f, -8.162f)
                close()
                moveTo(10.166f, 8.343f)
                lineTo(10.638f, 7.136f)
                lineTo(16.196f, 13.868f)
                close()
                moveTo(17.569f, 15.883f)
                lineTo(18.699f, 16.899f)
                lineTo(12.321f, 18.879f)
                close()
                moveTo(8.81f, 19.963f)
                lineTo(7.35f, 20.411f)
                lineTo(8.81f, 13.971f)
                close()
                moveTo(9.61f, 10.424f)
                lineTo(9.973f, 8.944f)
                lineTo(14.841f, 13.421f)
                close()
                moveTo(9.262f, 19.826f)
                verticalLineToRelative(-7.851f)
                lineToRelative(0.244f, -1.085f)
                lineToRelative(6.864f, 3.926f)
                lineToRelative(0.834f, 0.758f)
                lineTo(10.34f, 19.5f)
                close()
                moveTo(12.01f, 1.694f)
                lineTo(0.0f, 22.306f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _knime!!
    }

private var _knime: ImageVector? = null
