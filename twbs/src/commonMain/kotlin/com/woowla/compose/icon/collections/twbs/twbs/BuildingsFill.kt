package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BuildingsFill: ImageVector
    get() {
        if (_buildingsFill != null) {
            return _buildingsFill!!
        }
        _buildingsFill = Builder(name = "BuildingsFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.724f, -0.447f)
                lineToRelative(-8.0f, 4.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 6.0f, 4.5f)
                verticalLineToRelative(3.14f)
                lineTo(0.342f, 9.526f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 0.0f, 10.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(10.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 12.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(3.0f, 13.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(4.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 14.0f)
                close()
                moveTo(13.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 6.0f)
                close()
                moveTo(9.0f, 7.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 10.0f)
                close()
                moveTo(10.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(9.0f, 11.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(12.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(10.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(11.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(12.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _buildingsFill!!
    }

private var _buildingsFill: ImageVector? = null
