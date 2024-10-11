package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BuildingBroadcastTower: ImageVector
    get() {
        if (_buildingBroadcastTower != null) {
            return _buildingBroadcastTower!!
        }
        _buildingBroadcastTower = Builder(name = "BuildingBroadcastTower", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.497f, 3.327f)
                lineToRelative(2.452f, 7.357f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.898f, 0.632f)
                lineToRelative(-0.44f, -1.316f)
                horizontalLineToRelative(-3.224f)
                lineToRelative(-0.438f, 1.317f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.152f, 0.663f)
                lineToRelative(-0.113f, -0.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.633f, -1.265f)
                lineToRelative(2.452f, -7.357f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.503f, -1.328f)
                lineToRelative(0.005f, -0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.995f, -1.85f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.093f, 4.078f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 3.137f, 11.776f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.846f, -0.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.769f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.846f, 0.77f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 15.324f, -11.776f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.657f, 7.243f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.882f, 7.066f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.846f, -0.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.384f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.846f, 0.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.194f, -7.066f)
            }
        }
        .build()
        return _buildingBroadcastTower!!
    }

private var _buildingBroadcastTower: ImageVector? = null
