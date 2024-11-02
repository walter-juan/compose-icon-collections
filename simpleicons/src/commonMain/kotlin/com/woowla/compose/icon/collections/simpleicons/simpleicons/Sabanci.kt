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

public val Simpleicons.Sabanci: ImageVector
    get() {
        if (_sabanci != null) {
            return _sabanci!!
        }
        _sabanci = Builder(name = "Sabanci", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.388f, 8.88f)
                arcToRelative(15.803f, 15.803f, 0.0f, false, false, -1.537f, 0.105f)
                curveToRelative(-1.144f, 0.146f, -1.539f, 0.646f, -1.539f, 1.872f)
                curveToRelative(0.0f, 0.971f, 0.258f, 1.44f, 0.904f, 1.661f)
                curveToRelative(0.313f, 0.109f, 0.85f, 0.155f, 1.743f, 0.155f)
                horizontalLineToRelative(1.7f)
                arcToRelative(8.705f, 8.705f, 0.0f, false, true, 0.923f, 0.019f)
                curveToRelative(0.379f, 0.036f, 0.563f, 0.211f, 0.563f, 0.525f)
                curveToRelative(0.0f, 0.546f, -0.243f, 0.6f, -2.428f, 0.6f)
                arcToRelative(8.499f, 8.499f, 0.0f, false, true, -1.172f, -0.063f)
                curveToRelative(-0.277f, -0.066f, -0.34f, -0.175f, -0.359f, -0.637f)
                lineTo(2.339f, 13.118f)
                verticalLineToRelative(0.359f)
                curveToRelative(0.0f, 0.877f, 0.296f, 1.319f, 0.988f, 1.493f)
                curveToRelative(0.452f, 0.121f, 1.079f, 0.158f, 2.472f, 0.158f)
                arcToRelative(23.175f, 23.175f, 0.0f, false, false, 2.583f, -0.093f)
                curveToRelative(1.17f, -0.126f, 1.612f, -0.631f, 1.612f, -1.867f)
                curveToRelative(0.0f, -0.639f, -0.129f, -1.1f, -0.377f, -1.377f)
                curveToRelative(-0.287f, -0.33f, -0.665f, -0.442f, -1.588f, -0.486f)
                curveToRelative(-0.498f, -0.02f, -0.867f, -0.029f, -0.971f, -0.029f)
                lineTo(5.308f, 11.278f)
                arcToRelative(3.181f, 3.181f, 0.0f, false, true, -0.728f, -0.036f)
                arcToRelative(0.471f, 0.471f, 0.0f, false, true, -0.413f, -0.486f)
                curveToRelative(0.0f, -0.34f, 0.165f, -0.472f, 0.627f, -0.508f)
                curveToRelative(0.287f, -0.017f, 1.117f, -0.046f, 1.7f, -0.046f)
                curveToRelative(1.265f, 0.0f, 1.44f, 0.075f, 1.44f, 0.609f)
                horizontalLineToRelative(1.804f)
                curveToRelative(0.0f, -1.061f, -0.204f, -1.486f, -0.82f, -1.717f)
                curveToRelative(-0.471f, -0.175f, -0.96f, -0.211f, -2.759f, -0.211f)
                arcToRelative(15.803f, 15.803f, 0.0f, false, false, -0.77f, -0.003f)
                close()
                moveTo(16.609f, 8.925f)
                lineTo(13.149f, 15.075f)
                horizontalLineToRelative(2.122f)
                lineToRelative(0.59f, -1.097f)
                horizontalLineToRelative(3.968f)
                lineToRelative(0.607f, 1.097f)
                horizontalLineToRelative(2.049f)
                lineToRelative(-3.368f, -6.151f)
                close()
                moveTo(17.845f, 10.243f)
                lineTo(19.183f, 12.698f)
                lineTo(16.534f, 12.698f)
                close()
                moveTo(0.0f, 12.001f)
                arcToRelative(6.153f, 6.153f, 0.0f, false, true, 11.998f, -1.928f)
                arcToRelative(6.156f, 6.156f, 0.0f, true, true, 0.0f, 3.854f)
                arcTo(6.153f, 6.153f, 0.0f, false, true, 0.0f, 12.001f)
                close()
            }
        }
        .build()
        return _sabanci!!
    }

private var _sabanci: ImageVector? = null
