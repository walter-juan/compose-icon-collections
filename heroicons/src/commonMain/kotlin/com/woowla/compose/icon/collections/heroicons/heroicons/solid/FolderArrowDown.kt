package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.FolderArrowDown: ImageVector
    get() {
        if (_folderArrowDown != null) {
            return _folderArrowDown!!
        }
        _folderArrowDown = Builder(name = "FolderArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.5f, 21.0f)
                curveTo(21.157f, 21.0f, 22.5f, 19.657f, 22.5f, 18.0f)
                verticalLineTo(9.0f)
                curveTo(22.5f, 7.343f, 21.157f, 6.0f, 19.5f, 6.0f)
                horizontalLineTo(14.121f)
                curveTo(13.922f, 6.0f, 13.732f, 5.921f, 13.591f, 5.78f)
                lineTo(11.47f, 3.659f)
                curveTo(11.048f, 3.237f, 10.475f, 3.0f, 9.879f, 3.0f)
                horizontalLineTo(4.5f)
                curveTo(2.843f, 3.0f, 1.5f, 4.343f, 1.5f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.5f, 19.657f, 2.843f, 21.0f, 4.5f, 21.0f)
                horizontalLineTo(19.5f)
                close()
                moveTo(12.75f, 10.5f)
                curveTo(12.75f, 10.086f, 12.414f, 9.75f, 12.0f, 9.75f)
                curveTo(11.586f, 9.75f, 11.25f, 10.086f, 11.25f, 10.5f)
                lineTo(11.25f, 14.689f)
                lineTo(9.53f, 12.97f)
                curveTo(9.237f, 12.677f, 8.763f, 12.677f, 8.47f, 12.97f)
                curveTo(8.177f, 13.263f, 8.177f, 13.737f, 8.47f, 14.03f)
                lineTo(11.47f, 17.03f)
                curveTo(11.61f, 17.171f, 11.801f, 17.25f, 12.0f, 17.25f)
                curveTo(12.199f, 17.25f, 12.39f, 17.171f, 12.53f, 17.03f)
                lineTo(15.53f, 14.03f)
                curveTo(15.823f, 13.737f, 15.823f, 13.263f, 15.53f, 12.97f)
                curveTo(15.237f, 12.677f, 14.763f, 12.677f, 14.47f, 12.97f)
                lineTo(12.75f, 14.689f)
                lineTo(12.75f, 10.5f)
                close()
            }
        }
        .build()
        return _folderArrowDown!!
    }

private var _folderArrowDown: ImageVector? = null
